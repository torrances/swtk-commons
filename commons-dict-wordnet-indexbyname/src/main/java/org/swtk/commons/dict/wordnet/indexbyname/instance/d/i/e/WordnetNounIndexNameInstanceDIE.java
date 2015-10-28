package org.swtk.commons.dict.wordnet.indexbyname.instance.d.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"die\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03197591\", \"03197474\", \"03195713\"]}");
	add("{\"term\":\"dieback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14303800\"]}");
	add("{\"term\":\"dieffenbachia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11807860\"]}");
	add("{\"term\":\"diegueno\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935458\", \"09674603\"]}");
	add("{\"term\":\"diehard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10740773\"]}");
	add("{\"term\":\"dielectric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14845760\"]}");
	add("{\"term\":\"dielectrolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13493721\"]}");
	add("{\"term\":\"diemaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10032458\"]}");
	add("{\"term\":\"diencephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05504641\"]}");
	add("{\"term\":\"dieresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06836790\"]}");
	add("{\"term\":\"diervilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12692659\"]}");
	add("{\"term\":\"diesel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03197791\", \"10954879\"]}");
	add("{\"term\":\"diesinker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10032458\"]}");
	add("{\"term\":\"diesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06841712\"]}");
	add("{\"term\":\"diestock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03198438\"]}");
	add("{\"term\":\"diestrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14062225\"]}");
	add("{\"term\":\"diestrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14062225\"]}");
	add("{\"term\":\"diet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01072111\", \"07576468\", \"08335707\", \"07576677\"]}");
	add("{\"term\":\"dietary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07577155\"]}");
	add("{\"term\":\"dieter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10032031\"]}");
	add("{\"term\":\"dietetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06051718\"]}");
	add("{\"term\":\"diethylmalonylurea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02794917\"]}");
	add("{\"term\":\"diethylstilbesterol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03198566\"]}");
	add("{\"term\":\"diethylstilbestrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14774301\"]}");
	add("{\"term\":\"diethylstilboestrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14774301\"]}");
	add("{\"term\":\"dietician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10032289\"]}");
	add("{\"term\":\"dieting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01072111\"]}");
	add("{\"term\":\"dietitian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10032289\"]}");
	add("{\"term\":\"dietrich\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10955055\", \"10955318\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }