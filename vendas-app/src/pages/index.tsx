import Head from 'next/head'
import { Layout, Dashboard } from 'components'
import { DashboardData } from 'app/models/dashboard'
import { getDashboardData } from 'app/services'
import { RotaAutenticada } from 'components'

interface HomeProps {
  dashboard: DashboardData
}

const Home: React.FC<HomeProps> = (props: HomeProps) => {
  return (
    <RotaAutenticada>
      <Head>
        <title>Vendas App</title>
        <link rel="icon" href="/favicon.ico" />
      </Head>

      <Layout titulo="Dashboard">
        <Dashboard produtos={props.dashboard.produtos} 
                   clientes={props.dashboard.clientes} 
                   vendas={props.dashboard.vendas}  
                   vendasPorMes={props.dashboard.vendasPorMes}
                   />
      </Layout>
      
    </RotaAutenticada>
  )
}

export async function getStaticProps() {
  const dashboard: DashboardData = await getDashboardData(); // Agora chamamos diretamente a função de serviço

  return {
    props: {
      dashboard
    },
    revalidate: 5 // em segundos
  }
} 

export default Home;
