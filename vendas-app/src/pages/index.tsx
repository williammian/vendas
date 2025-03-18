import Head from 'next/head'
import { Layout, Dashboard } from 'components'
import { DashboardData } from 'app/models/dashboard'
import { getDashboardData } from 'app/services'

const Home: React.FC = (props: any) => {
  return (
    <div>
      <Head>
        <title>Vendas App</title>
        <link rel="icon" href="/favicon.ico" />
      </Head>

      <Layout titulo="Dashboard">
        <Dashboard produtos={props.dashboard.produtos} 
                   clientes={props.dashboard.clientes} 
                   vendas={props.dashboard.vendas}  />
      </Layout>
      
    </div>
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
