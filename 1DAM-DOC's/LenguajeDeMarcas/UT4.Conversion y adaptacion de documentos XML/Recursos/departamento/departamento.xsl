<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/departamento">
         <html>
            <head>
                <link rel="stylesheet" type="text/css" href="departamento.css"/>
            </head>
            <body>
                <table>
                    <tr><th>Profesor</th><th>Módulos impartidos</th></tr> 
                    <xsl:apply-templates select="profesores/profesor"/>
                 </table>
            </body>
            </html>
    </xsl:template>
    
    <xsl:template match="profesor">
        <tr>
            <td> <xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido1"/><xsl:text> </xsl:text><xsl:value-of select="apellido2"/> </td>
             <td><xsl:apply-templates select="modulosImpartidos/modulo"/><br/></td>
        </tr>
    </xsl:template>
    
    <xsl:template match="modulo">
        <xsl:value-of select="."/>
        <xsl:if test="@modalidad='P'"> (Presencial)</xsl:if>
        <xsl:if test="@modalidad='D'"> (Distancia)</xsl:if>
        <br />
    </xsl:template>
    
</xsl:stylesheet>