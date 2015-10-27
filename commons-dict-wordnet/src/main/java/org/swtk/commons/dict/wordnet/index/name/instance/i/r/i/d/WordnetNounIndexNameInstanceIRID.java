package org.swtk.commons.dict.wordnet.index.name.instance.i.r.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIRID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iridaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12431589\"]}");
	add("{\"term\":\"iridectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00680809\"]}");
	add("{\"term\":\"iridescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04960855\"]}");
	add("{\"term\":\"iridium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14666397\"]}");
	add("{\"term\":\"iridocyclitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14371179\"]}");
	add("{\"term\":\"iridokeratitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14371291\"]}");
	add("{\"term\":\"iridoncus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14341370\"]}");
	add("{\"term\":\"iridoprocne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01597971\"]}");
	add("{\"term\":\"iridosmine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14713139\"]}");
	add("{\"term\":\"iridotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00680967\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }