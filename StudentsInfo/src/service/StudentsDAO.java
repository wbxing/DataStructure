package service;
import entity.Students;
import java.util.List;

public interface StudentsDAO {
    //查询所有学生资料
    public List<Students> queryAllStudents();
    //根据学号查询
    public Students queryStudentsBySid(String sid);
    //添加学生
    public boolean addStudents(Students s);
    //修改学生资料
    public boolean updateStudents(Students s);
    //删除学生
    public boolean deleteStudents(String sid);
}
