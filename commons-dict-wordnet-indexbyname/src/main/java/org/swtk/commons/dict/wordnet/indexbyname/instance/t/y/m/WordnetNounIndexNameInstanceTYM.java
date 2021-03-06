package org.swtk.commons.dict.wordnet.indexbyname.instance.t.y.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTYM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tympan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03254272\"]}");
	add("{\"term\":\"tympani\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03618174\"]}");
	add("{\"term\":\"tympanic bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05291519\"]}");
	add("{\"term\":\"tympanic cavity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05332436\"]}");
	add("{\"term\":\"tympanic membrane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05326381\"]}");
	add("{\"term\":\"tympanic vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05391903\"]}");
	add("{\"term\":\"tympanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10754620\"]}");
	add("{\"term\":\"tympanites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14087359\"]}");
	add("{\"term\":\"tympanitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14381012\"]}");
	add("{\"term\":\"tympanoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00695673\"]}");
	add("{\"term\":\"tympanuchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01800993\"]}");
	add("{\"term\":\"tympanuchus cupido\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01801347\"]}");
	add("{\"term\":\"tympanuchus cupido cupido\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01801620\"]}");
	add("{\"term\":\"tympanuchus pallidicinctus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01801480\"]}");
	add("{\"term\":\"tympanum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03618174\", \"05326381\", \"05332436\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }