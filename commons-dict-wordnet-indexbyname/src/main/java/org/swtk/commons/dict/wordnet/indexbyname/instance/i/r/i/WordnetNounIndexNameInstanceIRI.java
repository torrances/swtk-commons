package org.swtk.commons.dict.wordnet.indexbyname.instance.i.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIRI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iridaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12431589\"]}");
	add("{\"term\":\"iridectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00680809\"]}");
	add("{\"term\":\"iridescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04960855\"]}");
	add("{\"term\":\"iridium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14666397\"]}");
	add("{\"term\":\"iridocyclitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14371179\"]}");
	add("{\"term\":\"iridokeratitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14371291\"]}");
	add("{\"term\":\"iridoncus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14341370\"]}");
	add("{\"term\":\"iridoprocne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01597971\"]}");
	add("{\"term\":\"iridosmine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14713139\"]}");
	add("{\"term\":\"iridotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00680967\"]}");
	add("{\"term\":\"iris\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03589818\", \"05327486\", \"12432427\"]}");
	add("{\"term\":\"irish\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06973518\", \"07923401\", \"09752192\"]}");
	add("{\"term\":\"irishman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09734561\"]}");
	add("{\"term\":\"irishwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09734699\"]}");
	add("{\"term\":\"iritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14371398\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }