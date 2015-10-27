package org.swtk.commons.dict.wordnet.index.name.instance.a.n.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANTA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"antabuse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03218754\"]}");
	add("{\"term\":\"antacid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14802178\"]}");
	add("{\"term\":\"antagonism\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01076176\", \"07563832\", \"13882745\", \"14003773\"]}");
	add("{\"term\":\"antagonist\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02717794\", \"05300919\", \"09792668\"]}");
	add("{\"term\":\"antakiya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09063473\"]}");
	add("{\"term\":\"antakya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09063473\"]}");
	add("{\"term\":\"antalya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09063314\"]}");
	add("{\"term\":\"antananarivo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08982238\"]}");
	add("{\"term\":\"antapex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08512259\"]}");
	add("{\"term\":\"antarctic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08511469\"]}");
	add("{\"term\":\"antarctica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09220984\"]}");
	add("{\"term\":\"antares\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09221875\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }