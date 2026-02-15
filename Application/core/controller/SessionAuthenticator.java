//import com.team.servlet.model.SysUser;
//import com.team.servlet.repository.DAO.SysUserDAO;
//
//import java.util.List;
//
//public class SessionAuthenticator {
//
//  public static SysUser authenticate(SysUser authenticateTarget) {
//    SysUserDAO dao = new SysUserDAO(); // instanciar aqui
//    List<SysUser> fetchedUserList = SysUserDAO.findAll ();
//
//    if (fetchedUserList.contains(authenticateTarget)) {
//      return fetchedUserList.get(fetchedUserList.indexOf(authenticateTarget));
//    }
//    return null;
//  }
//}
