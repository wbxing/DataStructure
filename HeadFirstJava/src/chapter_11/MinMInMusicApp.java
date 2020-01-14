package chapter_11;

import javax.sound.midi.*;

public class MinMInMusicApp {
    public static void main(String[] args) {
        MinMInMusicApp m = new MinMInMusicApp();
        m.play();
    }

    public void play() {
        try {
            // 取得 Sequencer 并将其打开
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            // 取得 Track
            Track track = seq.createTrack();
            // 对 Track 加入几个 MidiEvent
            // 创建 Message
            ShortMessage a = new ShortMessage();
            // 发出 44 音符
            a.setMessage(192, 1, 102, 0);
            // 在第一拍启动 a 这个 Message
            MidiEvent noteOn = new MidiEvent(a, 1);
            // 将 MidiEvent 加入 Track 中
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            // 将 Sequence 送到 Sequencer
            player.setSequence(seq);
            // 开始播放
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
