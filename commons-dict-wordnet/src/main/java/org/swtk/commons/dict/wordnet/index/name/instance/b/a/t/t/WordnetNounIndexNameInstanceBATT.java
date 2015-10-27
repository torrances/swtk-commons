package org.swtk.commons.dict.wordnet.index.name.instance.b.a.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBATT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"battalion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13797293\", \"08231004\"]}");
	add("{\"term\":\"batten\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02813143\", \"02814065\"]}");
	add("{\"term\":\"batter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07876781\", \"09863364\"]}");
	add("{\"term\":\"battercake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07655812\"]}");
	add("{\"term\":\"battering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01178605\"]}");
	add("{\"term\":\"battery\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00769692\", \"00989949\", \"02813917\", \"08094013\", \"07970413\", \"02813606\", \"08406303\"]}");
	add("{\"term\":\"batting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02814065\", \"00127404\"]}");
	add("{\"term\":\"battle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00961007\", \"00790634\", \"00955670\"]}");
	add("{\"term\":\"battledore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00481896\", \"02775705\"]}");
	add("{\"term\":\"battlefield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08523662\"]}");
	add("{\"term\":\"battlefront\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08591221\"]}");
	add("{\"term\":\"battleground\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08523662\"]}");
	add("{\"term\":\"battlement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02815071\"]}");
	add("{\"term\":\"battler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09958771\"]}");
	add("{\"term\":\"battleship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02815336\"]}");
	add("{\"term\":\"battlesight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02815477\"]}");
	add("{\"term\":\"battlewagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02815336\"]}");
	add("{\"term\":\"battue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00225127\", \"00453758\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }