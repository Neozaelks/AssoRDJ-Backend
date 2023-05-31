package fr.associationrdj.backend.back.permission;

import fr.associationrdj.backend.back.reservation.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/permissions")
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    public List<Permission> findAll(){
        return permissionService.findAll();
    }
    public Permission findById(@PathVariable("id") Long id){
        return permissionService.findById(id);
    }
    public void save(@RequestBody Permission permission){
         permissionService.save(permission);
    }
    public void deleteById(@PathVariable("id")Long id) { permissionService.deleteById(id); }
    public Permission update(@RequestBody Permission permission){
        return permissionService.update(permission);
    }

}