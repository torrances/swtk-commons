package org.swtk.commons.dict.wordnet.indexbyname.instance.s.i.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14722394\"]}");
	add("{\"term\":\"sialadenitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14379130\"]}");
	add("{\"term\":\"sialia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01564525\"]}");
	add("{\"term\":\"sialidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02269232\"]}");
	add("{\"term\":\"sialis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02269384\"]}");
	add("{\"term\":\"sialis lutaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02269516\"]}");
	add("{\"term\":\"sialolith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09457029\"]}");
	add("{\"term\":\"siam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09058927\"]}");
	add("{\"term\":\"siamang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02486339\"]}");
	add("{\"term\":\"siamese\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02126249\", \"04219640\", \"09753726\", \"06948926\"]}");
	add("{\"term\":\"siamese cat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02126249\"]}");
	add("{\"term\":\"siamese connection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04219640\"]}");
	add("{\"term\":\"siamese twin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10614420\"]}");
	add("{\"term\":\"sian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08747285\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }