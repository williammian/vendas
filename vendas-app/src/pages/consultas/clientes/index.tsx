import { ListagemClientes, RotaAutenticada  } from 'components'

export default function ListagemClientesPage() {
    return(
        <RotaAutenticada>
            <ListagemClientes />
        </RotaAutenticada>
    )
}