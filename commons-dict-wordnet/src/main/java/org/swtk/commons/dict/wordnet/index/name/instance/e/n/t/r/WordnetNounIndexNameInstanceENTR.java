package org.swtk.commons.dict.wordnet.index.name.instance.e.n.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"entrails\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05306487\"]}");
	add("{\"term\":\"entrance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00049744\", \"07384725\", \"03295682\"]}");
	add("{\"term\":\"entrancement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07506426\"]}");
	add("{\"term\":\"entranceway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03295682\"]}");
	add("{\"term\":\"entrant\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10079883\", \"10079983\", \"10375148\", \"03296154\"]}");
	add("{\"term\":\"entrapment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01201525\"]}");
	add("{\"term\":\"entreaty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07201488\"]}");
	add("{\"term\":\"entrecote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07672475\"]}");
	add("{\"term\":\"entree\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00050548\", \"03295682\", \"05183715\", \"07595140\"]}");
	add("{\"term\":\"entremets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07595618\"]}");
	add("{\"term\":\"entrenchment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03296462\"]}");
	add("{\"term\":\"entrepot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04336328\", \"08655346\"]}");
	add("{\"term\":\"entrepreneur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10080160\"]}");
	add("{\"term\":\"entresol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03763618\"]}");
	add("{\"term\":\"entric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01370413\"]}");
	add("{\"term\":\"entropy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05019769\", \"05098731\"]}");
	add("{\"term\":\"entry\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00049744\", \"03295682\", \"07182229\", \"13426469\", \"00238889\", \"06515715\"]}");
	add("{\"term\":\"entryway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03295682\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }