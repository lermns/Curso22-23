create or replace trigger prueba_trigger
before insert on emple
for each row
begin
 dbms_output.put_line('ENHORABUENA, HAS CONTRATADO AL NUEVO EMPLEADO: '||:new.apellido||'.');
 --En este ejemplo solo se muestra un texto, pero podr�a hacerse cualquier acci�n en la BD (actualizaci�n de tablas...)
END;
/