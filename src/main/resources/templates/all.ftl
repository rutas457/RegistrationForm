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
            <th>ID</th>
            <th>EMAIL</th>
            <th>PASSWORD</th>
            <th>ROLE</th>
        </tr>
        <#list users as item>
            <tr>
                <td>${item.id}</td>
                <td>${item.email}</td>
                <td>${item.password}</td>
                <td>${item.role}</td>
            </tr>
        </#list>
</table>