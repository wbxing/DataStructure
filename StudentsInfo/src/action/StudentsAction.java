package action;
import entity.Students;
import service.StudentsDAO;
import service.impl.StudentsDAOImpl;
import java.text.SimpleDateFormat;
import java.util.List;

public class StudentsAction extends SuperAction {
    public static final long serialVersion = 1l;

    //查询所有学生
    public String query() {
        StudentsDAO sdao = new StudentsDAOImpl();
        List<Students> list = sdao.queryAllStudents();

        //放入session
        if (list!=null && list.size()>0) {
            session.setAttribute("students_list", list);
        } else {
            session.setAttribute("students_list", null);
        }
        return "query_success";
    }

    //删除学生信息
    public String delete() {
        StudentsDAO sdao = new StudentsDAOImpl();
        String sid = request.getParameter("sid");
        sdao.deleteStudents(sid);
        return "delete_success";
    }

    //添加学生
    public String add() throws Exception {
        Students s = new Students();
        s.setSname(request.getParameter("sname"));
        s.setGender(request.getParameter("gender"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        s.setBirthday(sdf.parse(request.getParameter("birthday")));
        s.setAddress(request.getParameter("address"));
        StudentsDAO sdao = new StudentsDAOImpl();
        sdao.addStudents(s);
        return "add_success";
    }

    //修改学生
    public String modify() {

        String sid = request.getParameter("sid");
        StudentsDAO sdao = new StudentsDAOImpl();
        Students s = sdao.queryStudentsBySid(sid);
        session.setAttribute("modify_students", s);
        return "modify_success";
    }

    //保存修改后的学生
    public String save() throws Exception{
        Students s = new Students();
        s.setSid(request.getParameter("sid"));
        s.setSname(request.getParameter("sname"));
        s.setGender(request.getParameter("gender"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        s.setBirthday(sdf.parse(request.getParameter("birthday")));
        s.setAddress(request.getParameter("address"));
        StudentsDAO sdao = new StudentsDAOImpl();
        sdao.updateStudents(s);
        return "save_success";
    }
}
