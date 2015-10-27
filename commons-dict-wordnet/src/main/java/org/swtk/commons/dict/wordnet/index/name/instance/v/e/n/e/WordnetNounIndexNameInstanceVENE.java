package org.swtk.commons.dict.wordnet.index.name.instance.v.e.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVENE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"veneer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03320935\", \"04532712\"]}");
	add("{\"term\":\"veneering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00928976\", \"04532712\"]}");
	add("{\"term\":\"venerability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04876618\"]}");
	add("{\"term\":\"venerableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04876618\"]}");
	add("{\"term\":\"veneration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01046545\", \"07536278\"]}");
	add("{\"term\":\"venerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10767216\"]}");
	add("{\"term\":\"veneridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01960232\"]}");
	add("{\"term\":\"venesection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00699862\"]}");
	add("{\"term\":\"venetia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08830804\"]}");
	add("{\"term\":\"venetian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09736850\"]}");
	add("{\"term\":\"veneto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08830804\"]}");
	add("{\"term\":\"venezia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08831116\"]}");
	add("{\"term\":\"venezuela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09184596\"]}");
	add("{\"term\":\"venezuelan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09766393\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }