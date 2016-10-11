/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.persistence.jdbcimpl;

import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import edu.eci.pdsw.samples.persistence.DaoUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class JDBCDaoUsuario implements DaoUsuario {

    Connection con;

    public JDBCDaoUsuario(Connection con) {
        this.con = con;
    }
        

    @Override
    public Usuario load(String email) throws PersistenceException {
        PreparedStatement ps;        
        /*try {
        
        
          
        } catch (SQLException ex) {
            throw new PersistenceException("An error ocurred while loading "+email,ex);
        }*/
        throw new RuntimeException("No se ha implementado el metodo 'load' del DAOUsuarioJDBC");
    }

    @Override
    public void save(Usuario u) throws PersistenceException {
        PreparedStatement ps;
        
        //throw new RuntimeException("No se ha implementado el metodo 'save' del DAOPUsuarioJDBC");

    }

    @Override
    public void update(Usuario u) throws PersistenceException {
        PreparedStatement ps;
        /*try {
            
        } catch (SQLException ex) {
            throw new PersistenceException("An error ocurred while updating Usuario.",ex);
        } */
        throw new RuntimeException("No se ha implementado el metodo 'update' del DAOPAcienteJDBC");
    }
    
}
