export const converterEmBigDecimal = (value: string | null | undefined): number => {
    if (!value) {
        return 0;
    }
    return parseFloat(value.replace(/\./g, "").replace(",", "."));
};

export const formatReal = (valor: string | number): string => {
    if (typeof valor === "number") {
        valor = valor.toFixed(2); // Converte número para string no formato decimal
    }

    valor = valor.replace(/\D/g, ""); // Remove caracteres não numéricos
    const v = ((parseInt(valor) / 100).toFixed(2) + "").split(".");

    const m = v[0].split("").reverse().join("").match(/.{1,3}/g);

    if (m) {
        for (let i = 0; i < m.length; i++) {
            m[i] = m[i].split("").reverse().join("") + ".";
        }
    }

    const r = m ? m.reverse().join("") : v[0];

    return r.substring(0, r.lastIndexOf(".")) + "," + v[1];
};
