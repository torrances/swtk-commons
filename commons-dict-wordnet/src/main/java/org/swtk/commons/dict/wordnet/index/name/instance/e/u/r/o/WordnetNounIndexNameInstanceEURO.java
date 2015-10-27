package org.swtk.commons.dict.wordnet.index.name.instance.e.u.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEURO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"euro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13683925\"]}");
	add("{\"term\":\"eurobabble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07083672\"]}");
	add("{\"term\":\"eurocentrism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06211513\"]}");
	add("{\"term\":\"eurocurrency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13407309\"]}");
	add("{\"term\":\"eurodollar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13696584\"]}");
	add("{\"term\":\"euronithopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01707888\"]}");
	add("{\"term\":\"euronithopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01707888\"]}");
	add("{\"term\":\"europa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09298241\"]}");
	add("{\"term\":\"europan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06908961\"]}");
	add("{\"term\":\"europe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08189594\", \"08190414\", \"09298379\"]}");
	add("{\"term\":\"european\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09705914\"]}");
	add("{\"term\":\"europeanisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13497643\"]}");
	add("{\"term\":\"europeanization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13497643\"]}");
	add("{\"term\":\"europium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14661354\"]}");
	add("{\"term\":\"europol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08226963\"]}");
	add("{\"term\":\"eurotiales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13047523\"]}");
	add("{\"term\":\"eurotium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13047809\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }