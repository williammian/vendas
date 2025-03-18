import { httpClient } from 'app/http'
import { AxiosResponse } from 'axios'
import { DashboardData } from 'app/models/dashboard'

const resourceURL: string = "/api/dashboard"

// Função para buscar os dados do dashboard (agora pode ser usada em qualquer lugar)
export const getDashboardData = async (): Promise<DashboardData> => {
    const response: AxiosResponse<DashboardData> = await httpClient.get(resourceURL);
    return response.data;
}

// Hook para usar dentro de componentes React
export const useDashboardService = () => {
    return {
        getDashboardData
    }
}