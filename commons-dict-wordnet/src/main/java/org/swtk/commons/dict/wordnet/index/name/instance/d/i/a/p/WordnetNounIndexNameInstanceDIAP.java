package org.swtk.commons.dict.wordnet.index.name.instance.d.i.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"diapason\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03193100\"]}");
	add("{\"term\":\"diapedesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11466694\"]}");
	add("{\"term\":\"diapensia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12271518\"]}");
	add("{\"term\":\"diapensiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12270930\"]}");
	add("{\"term\":\"diapensiales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12271225\"]}");
	add("{\"term\":\"diaper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03193409\", \"03193215\"]}");
	add("{\"term\":\"diapheromera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02234455\"]}");
	add("{\"term\":\"diaphone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03193555\"]}");
	add("{\"term\":\"diaphoresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13556464\"]}");
	add("{\"term\":\"diaphoretic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03193663\"]}");
	add("{\"term\":\"diaphragm\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03193995\", \"03194145\", \"05326156\", \"03193767\"]}");
	add("{\"term\":\"diaphysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05600488\"]}");
	add("{\"term\":\"diapir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09289510\"]}");
	add("{\"term\":\"diapsid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01664459\"]}");
	add("{\"term\":\"diapsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01664701\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }