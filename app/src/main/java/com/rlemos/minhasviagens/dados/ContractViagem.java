package com.rlemos.minhasviagens.dados;

import android.provider.BaseColumns;

/**
 * Created by rlemos on 02/08/17.
 */

public class ContractViagem {

    //Campos específico da tabela País
    public static final class EntryPais implements BaseColumns{

        public final static String TABLE_NAME = "pais";

        public final static String ID_PAIS = "id_pais";

        public final static String NOME_PAIS = "nome_pais";

        public final static String ENABLED_PAIS = "enabled_pais";

        public final static String DT_ULT_VIAGEM = "dt_ultima_viagem";

    }

    //Campos específicos da tabela Estado
    public static final class EntryEstado implements BaseColumns{

        public final static String TABLE_NAME = "estado";

        public final static String ID_ESTADO = "id_estado";

        public final static String ENABLED_ESTADO = "enabled_estado";

        public final static String DT_ULT_VIAGEM = "dt_ult_viagem";

    }

    //Campos específicos da tabela Viagem
    public static final class EntryViagem implements BaseColumns{

        public final static String TABLE_NAME = "Viagem";

        public final static String ID_VIAGEM = "id_viagem";

        public final static String CIDADE = "cidade_viagem";

        public final static String DT_VIAGEM = "dt_viagem";

        public final static String QTD_DIAS = "qtd_dias";

        public final static String HOSP_VIAGEM = "hosp_viagem";

        public final static String PASSEIOS_VIAGEM = "passeios_viagem";

        public final static String DESC_VIAGEM = "desc_viagem";

    }
}
