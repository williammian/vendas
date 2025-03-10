import { Cliente } from "app/models/clientes";
import { Produto } from "app/models/produtos";

export interface Venda {
    cliente?: Cliente | null | undefined;
    itens?: Array<ItemVenda>;
    formaPagamento?: string;
    total: number;
}

export interface ItemVenda {
    produto: Produto;
    quantidade: number;
}