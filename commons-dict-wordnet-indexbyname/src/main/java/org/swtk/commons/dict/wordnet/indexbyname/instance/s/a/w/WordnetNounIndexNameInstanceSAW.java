package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"saw\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04002503\", \"04147147\", \"07168546\"]}");
	add("{\"term\":\"sawan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15245181\"]}");
	add("{\"term\":\"sawbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01857056\"]}");
	add("{\"term\":\"sawbones\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10698621\"]}");
	add("{\"term\":\"sawbuck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04147696\"]}");
	add("{\"term\":\"sawdust\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15044674\"]}");
	add("{\"term\":\"sawfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01499759\"]}");
	add("{\"term\":\"sawfly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02221365\"]}");
	add("{\"term\":\"sawhorse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04147696\"]}");
	add("{\"term\":\"sawm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05923185\"]}");
	add("{\"term\":\"sawmill\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03702341\", \"04147842\"]}");
	add("{\"term\":\"sawpit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09447897\"]}");
	add("{\"term\":\"sawtooth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04148041\"]}");
	add("{\"term\":\"sawwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12035392\"]}");
	add("{\"term\":\"sawyer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02171675\", \"10573569\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }