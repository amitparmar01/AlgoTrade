package com.deepak.just_hdm;

public class AppConstant {
	
	
	public static final double NAN = -999999;
	public static final double FIXED_INTEREST_RATE =  6.0;
	
	public static final String currentSeries = "27SEP2018";
	public static final String nextSeries = "25OCT2018";
	public static final String scripNames[] = {"ACC",
"ADANIENT",
"ADANIPORTS",
"ADANIPOWER",
"AJANTPHARM",
"ALBK",
"AMARAJABAT",
"AMBUJACEM",
"ANDHRABANK",
"APOLLOHOSP",
"APOLLOTYRE",
"ARVIND",
"ASHOKLEY",
"ASIANPAINT",
"AUROPHARMA",
"AXISBANK",
"BAJAJ-AUTO",
"BAJAJFINSV",
"BAJFINANCE",
"BALKRISIND",
"BALRAMCHIN",
"BANKBARODA",
"BANKINDIA",
"BATAINDIA",
"BEL",
"BEML",
"BERGEPAINT",
"BHARATFIN",
"BHARATFORG",
"BHARTIARTL",
"BHEL",
"BIOCON",
"BOSCHLTD",
"BPCL",
"BRITANNIA",
"CADILAHC",
"CANBK",
"CANFINHOME",
"CAPF",
"CASTROLIND",
"CEATLTD",
"CENTURYTEX",
"CESC",
"CGPOWER",
"CHENNPETRO",
"CHOLAFIN",
"CIPLA",
"COALINDIA",
"COLPAL",
"CONCOR",
"CUMMINSIND",
"DABUR",
"DALMIABHA",
"DCBBANK",
"DHFL",
"DISHTV",
"DIVISLAB",
"DLF",
"DRREDDY",
"EICHERMOT",
"ENGINERSIN",
"EQUITAS",
"ESCORTS",
"EXIDEIND",
"FEDERALBNK",
"GAIL",
"GLENMARK",
"GMRINFRA",
"GODFRYPHLP",
"GODREJCP",
"GODREJIND",
"GRANULES",
"GRASIM",
"GSFC",
"HAVELLS",
"HCC",
"HCLTECH",
"HDFC",
"HDFCBANK",
"HEROMOTOCO",
"HEXAWARE",
"HINDALCO",
"HINDPETRO",
"HINDUNILVR",
"HINDZINC",
"IBULHSGFIN",
"ICICIBANK",
"ICICIPRULI",
"IDBI",
"IDEA",
"IDFC",
"IDFCBANK",
"IFCI",
"IGL",
"INDIACEM",
"INDIANB",
"INDIGO",
"INDUSINDBK",
"INFIBEAM",
"INFRATEL",
"INFY",
"IOC",
"IRB",
"ITC",
"JETAIRWAYS",
"JINDALSTEL",
"JISLJALEQS",
"JPASSOCIAT",
"JSWSTEEL",
"JUBLFOOD",
"JUSTDIAL",
"KAJARIACER",
"KOTAKBANK",
"KPIT",
"KSCL",
"KTKBANK",
"L&TFH",
"LICHSGFIN",
"LT",
"LUPIN",
"M&M",
"M&MFIN",
"MANAPPURAM",
"MARICO",
"MARUTI",
"MCDOWELL-N",
"MCX",
"MFSL",
"MGL",
"MINDTREE",
"MOTHERSUMI",
"MRF",
"MRPL",
"MUTHOOTFIN",
"NATIONALUM",
"NBCC",
"NCC",
"NESTLEIND",
"NHPC",
"NIITTECH",
"NMDC",
"NTPC",
"OFSS",
"OIL",
"ONGC",
"ORIENTBANK",
"PAGEIND",
"PCJEWELLER",
"PEL",
"PETRONET",
"PFC",
"PIDILITIND",
"PNB",
"POWERGRID",
"PTC",
"PVR",
"RAMCOCEM",
"RAYMOND",
"RBLBANK",
"RCOM",
"RECLTD",
"RELCAPITAL",
"RELIANCE",
"RELINFRA",
"REPCOHOME",
"RPOWER",
"SAIL",
"SBIN",
"SHREECEM",
"SIEMENS",
"SOUTHBANK",
"SREINFRA",
"SRF",
"SRTRANSFIN",
"STAR",
"SUNPHARMA",
"SUNTV",
"SUZLON",
"SYNDIBANK",
"TATACHEM",
"TATACOMM",
"TATAELXSI",
"TATAGLOBAL",
"TATAMOTORS",
"TATAMTRDVR",
"TATAPOWER",
"TATASTEEL",
"TCS",
"TECHM",
"TITAN",
"TORNTPHARM",
"TORNTPOWER",
"TV18BRDCST",
"TVSMOTOR",
"UBL",
"UJJIVAN",
"ULTRACEMCO",
"UNIONBANK",
"UPL",
"VEDL",
"VGUARD",
"VOLTAS",
"WIPRO",
"WOCKPHARMA",
"YESBANK",
"ZEEL"};

	public static String scripLotSizeArray[] = {"ACC|400",
			"ADANIENT|4000",
			"ADANIPORTS|2500",
			"ADANIPOWER|20000",
			"AJANTPHARM|500",
			"ALBK|11000",
			"AMARAJABAT|700",
			"AMBUJACEM|2500",
			"ANDHRABANK|13000",
			"APOLLOHOSP|500",
			"APOLLOTYRE|3000",
			"ARVIND|2000",
			"ASHOKLEY|4000",
			"ASIANPAINT|600",
			"AUROPHARMA|1000",
			"AXISBANK|1200",
			"BAJAJ-AUTO|250",
			"BAJAJFINSV|125",
			"BAJFINANCE|500",
			"BALKRISIND|800",
			"BALRAMCHIN|7000",
			"BANKBARODA|4000",
			"BANKINDIA|6000",
			"BANKNIFTY|40",
			"BATAINDIA|1100",
			"BEL|4950",
			"BEML|500",
			"BERGEPAINT|2200",
			"BHARATFIN|500",
			"BHARATFORG|1200",
			"BHARTIARTL|1700",
			"BHEL|7500",
			"BIOCON|900",
			"BOSCHLTD|30",
			"BPCL|1800",
			"BRITANNIA|200",
			"CADILAHC|1600",
			"CANBK|2000",
			"CANFINHOME|1250",
			"CAPF|800",
			"CASTROLIND|2800",
			"CEATLTD|350",
			"CENTURYTEX|550",
			"CESC|550",
			"CGPOWER|12000",
			"CHENNPETRO|1500",
			"CHOLAFIN|500",
			"CIPLA|1000",
			"COALINDIA|2200",
			"COLPAL|700",
			"CONCOR|1250",
			"CUMMINSIND|700",
			"DABUR|2500",
			"DALMIABHA|300",
			"DCBBANK|4500",
			"DHFL|1500",
			"DISHTV|8000",
			"DIVISLAB|800",
			"DLF|2500",
			"DRREDDY|250",
			"EICHERMOT|25",
			"ENGINERSIN|3500",
			"EQUITAS|4000",
			"ESCORTS|1100",
			"EXIDEIND|4000",
			"FEDERALBNK|5500",
			"GAIL|2667",
			"GLENMARK|1000",
			"GMRINFRA|45000",
			"GODFRYPHLP|700",
			"GODREJCP|800",
			"GODREJIND|1500",
			"GRANULES|5000",
			"GRASIM|750",
			"GSFC|4500",
			"HAVELLS|1000",
			"HCC|18000",
			"HCLTECH|700",
			"HDFC|500",
			"HDFCBANK|500",
			"HEROMOTOCO|200",
			"HEXAWARE|1500",
			"HINDALCO|3500",
			"HINDPETRO|1575",
			"HINDUNILVR|600",
			"HINDZINC|3200",
			"IBULHSGFIN|500",
			"ICICIBANK|2750",
			"ICICIPRULI|1300",
			"IDBI|10000",
			"IDEA|7000",
			"IDFC|13200",
			"IDFCBANK|11000",
			"IFCI|25000",
			"IGL|2750",
			"INDIACEM|3500",
			"INDIANB|2000",
			"INDIGO|600",
			"INDUSINDBK|300",
			"INFIBEAM|4000",
			"INFRATEL|1700",
			"INFY|600",
			"IOC|3000",
			"IRB|2500",
			"ITC|2400",
			"JETAIRWAYS|1200",
			"JINDALSTEL|2250",
			"JISLJALEQS|9000",
			"JPASSOCIAT|34000",
			"JSWSTEEL|3000",
			"JUBLFOOD|500",
			"JUSTDIAL|1400",
			"KAJARIACER|1000",
			"KOTAKBANK|800",
			"KPIT|4500",
			"KSCL|1500",
			"KTKBANK|4500",
			"L&TFH|4500",
			"LICHSGFIN|1100",
			"LT|750",
			"LUPIN|700",
			"M&M|1000",
			"M&MFIN|1250",
			"MANAPPURAM|6000",
			"MARICO|2600",
			"MARUTI|75",
			"MCDOWELL-N|1250",
			"MCX|700",
			"MFSL|1200",
			"MGL|600",
			"MINDTREE|1200",
			"MOTHERSUMI|1600",
			"MRF|10",
			"MRPL|4500",
			"MUTHOOTFIN|1500",
			"NATIONALUM|8000",
			"NBCC|6000",
			"NCC|8000",
			"NESTLEIND|100",
			"NHPC|27000",
			"NMDC|6000",
			"NTPC|4000",
			"OFSS|150",
			"OIL|3399",
			"ONGC|3750",
			"ORIENTBANK|6000",
			"PAGEIND|25",
			"PCJEWELLER|1500",
			"PEL|302",
			"PETRONET|3000",
			"PFC|6000",
			"PIDILITIND|1000",
			"PNB|5500",
			"POWERGRID|4000",
			"PTC|8000",
			"PVR|400",
			"RAMCOCEM|800",
			"RAYMOND|800",
			"RBLBANK|1200",
			"RCOM|28000",
			"RECLTD|6000",
			"RELCAPITAL|1500",
			"RELIANCE|1000",
			"RELINFRA|1300",
			"REPCOHOME|900",
			"RPOWER|13000",
			"SAIL|12000",
			"SBIN|3000",
			"SHREECEM|50",
			"SIEMENS|500",
			"SOUTHBANK|33141",
			"SREINFRA|7000",
			"SRF|500",
			"SRTRANSFIN|600",
			"STAR|800",
			"SUNPHARMA|1100",
			"SUNTV|1000",
			"SUZLON|45000",
			"SYNDIBANK|9000",
			"TATACHEM|750",
			"TATACOMM|800",
			"TATAELXSI|800",
			"TATAGLOBAL|2250",
			"TATAMOTORS|1500",
			"TATAMTRDVR|2800",
			"TATAPOWER|9000",
			"TATASTEEL|1061",
			"TCS|500",
			"TECHM|1200",
			"TITAN|750",
			"TORNTPHARM|500",
			"TORNTPOWER|3000",
			"TV18BRDCST|8500",
			"TVSMOTOR|1000",
			"UBL|700",
			"UJJIVAN|1600",
			"ULTRACEMCO|200",
			"UNIONBANK|6000",
			"UPL|1200",
			"VEDL|1750",
			"VGUARD|3000",
			"VOLTAS|1000",
			"WIPRO|2400",
			"WOCKPHARMA|900",
			"YESBANK|1750",
			"ZEEL|1300",
};
	
	
	public static final String callOptionType = "CE";
	public static final String putOptionType = "PE";
	
	public static final String charset = "UTF-8";
	
	public static final int lotSize =10000;
	

}
