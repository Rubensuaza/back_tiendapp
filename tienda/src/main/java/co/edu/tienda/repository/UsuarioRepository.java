package co.edu.tienda.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import co.edu.tienda.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNombreUsuario(String nombreUsuario);
	
	
	@Query( value = "SELECT r.nombre_rol FROM usuario u JOIN users_authorities ua ON u.id_usuario=ua.id_usuario JOIN roles r ON ua.id_rol=r.id_rol WHERE u.id_usuario LIKE %:id_usuario%",   nativeQuery = true)
	List<String> findByForekeyId(@Param("id_usuario") int id_usuario);
	
	@Query( value = "SELECT ut.id_usuario_tienda FROM usuario u JOIN usuariotiendapp ut ON u.id_usuario=ut.id_usuario WHERE u.nombre_usuario LIKE  %:userName%",   nativeQuery = true)
	int findByUserName(@Param("userName") String userName);


}
