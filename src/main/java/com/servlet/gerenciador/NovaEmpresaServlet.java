package com.servlet.gerenciador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomeEmpresa = req.getParameter("nome");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
        System.out.println("cadastrando uma nova empresa");
    }
}