package org.swtk.commons.dict.wordnet.index.name.instance.m.a.n.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMANU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"manual\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00896833\", \"06433328\"]}");
	add("{\"term\":\"manubrium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05289083\"]}");
	add("{\"term\":\"manufactory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03321351\"]}");
	add("{\"term\":\"manufacture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00926639\", \"00925258\"]}");
	add("{\"term\":\"manufacturer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10311977\", \"08077282\"]}");
	add("{\"term\":\"manufacturing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00926639\"]}");
	add("{\"term\":\"manul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02129439\"]}");
	add("{\"term\":\"manumission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01250354\"]}");
	add("{\"term\":\"manumitter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10070834\"]}");
	add("{\"term\":\"manure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14887672\"]}");
	add("{\"term\":\"manus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05572223\"]}");
	add("{\"term\":\"manuscript\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06418864\", \"06418622\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }