package org.swtk.commons.dict.wordnet.indexbyname.instance.m.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"may\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12648511\", \"15236280\"]}");
	add("{\"term\":\"may apple\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11720527\", \"11720748\"]}");
	add("{\"term\":\"may beetle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02175522\", \"02177311\"]}");
	add("{\"term\":\"may blob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11748568\"]}");
	add("{\"term\":\"may bug\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02175522\", \"02177311\"]}");
	add("{\"term\":\"may day\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15213868\"]}");
	add("{\"term\":\"may fish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01449972\"]}");
	add("{\"term\":\"may lily\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12492049\"]}");
	add("{\"term\":\"may queen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10323827\"]}");
	add("{\"term\":\"may wine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07948110\"]}");
	add("{\"term\":\"maya\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06931991\", \"08501397\", \"09668014\"]}");
	add("{\"term\":\"maya lin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11152235\"]}");
	add("{\"term\":\"mayaca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12629381\"]}");
	add("{\"term\":\"mayacaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12629208\"]}");
	add("{\"term\":\"mayakovski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11186722\"]}");
	add("{\"term\":\"mayan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06931991\", \"09668014\"]}");
	add("{\"term\":\"mayan language\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06931991\"]}");
	add("{\"term\":\"mayapple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11720527\"]}");
	add("{\"term\":\"mayday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06816812\"]}");
	add("{\"term\":\"mayeng\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12221422\"]}");
	add("{\"term\":\"mayenne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08963234\"]}");
	add("{\"term\":\"mayer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11186867\", \"11187078\"]}");
	add("{\"term\":\"mayetiola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02192187\"]}");
	add("{\"term\":\"mayetiola destructor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02192322\"]}");
	add("{\"term\":\"mayfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01449972\"]}");
	add("{\"term\":\"mayflower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12255568\", \"03738483\"]}");
	add("{\"term\":\"mayfly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02265101\"]}");
	add("{\"term\":\"mayhaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12648287\"]}");
	add("{\"term\":\"mayhem\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00555144\", \"00771640\"]}");
	add("{\"term\":\"mayidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14224355\"]}");
	add("{\"term\":\"mayo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07850483\"]}");
	add("{\"term\":\"mayonnaise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07850483\"]}");
	add("{\"term\":\"mayor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10323481\"]}");
	add("{\"term\":\"mayoralty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00596448\"]}");
	add("{\"term\":\"mayoress\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10323685\", \"10323753\"]}");
	add("{\"term\":\"maypole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03738622\"]}");
	add("{\"term\":\"maypop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12404744\"]}");
	add("{\"term\":\"mays\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11187259\"]}");
	add("{\"term\":\"mayweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11943643\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }