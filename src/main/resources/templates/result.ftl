<style>table {
        width: 100%;
        border-collapse: collapse;
    }

    table thead tr {
        color: #ffffff;
        font-weight: bold;
        background: #00bf80;
    }

    table thead tr td {
        border: 1px solid #01ab73;
    }

    table tbody tr td {
        border: 1px solid #e8e9eb;
    }

    table tbody tr:nth-child(2n) {
        background: #f4f4f4;
    }

    table tbody tr:hover {
        background: #ebffe8;
    }</style>
<table>
    <tr>
        <th bgcolor=#00bf80>YOUR ID</th>
        <th bgcolor=#00bf80>YOUR EMAIL</th>
        <th bgcolor=#00bf80>YOUR PASSWORD</th>
        <th bgcolor=#00bf80>YOUR ROLE</th>
    </tr>
        <tr>
            <td align="center">${user.id}</td>
            <td align="center">${user.email}</td>
            <td align="center">${user.password}</td>
            <td align="center">${user.role}</td>
        </tr>
</table>