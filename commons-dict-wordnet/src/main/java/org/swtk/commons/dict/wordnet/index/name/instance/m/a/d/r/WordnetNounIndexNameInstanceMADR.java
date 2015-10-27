package org.swtk.commons.dict.wordnet.index.name.instance.m.a.d.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMADR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"madras\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03709401\", \"08924360\", \"08925435\"]}");
	add("{\"term\":\"madrasa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08300101\"]}");
	add("{\"term\":\"madrasah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08300101\"]}");
	add("{\"term\":\"madreporaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01919379\"]}");
	add("{\"term\":\"madrepore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01919566\"]}");
	add("{\"term\":\"madrid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09046837\"]}");
	add("{\"term\":\"madrigal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07066965\"]}");
	add("{\"term\":\"madrigalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10299564\"]}");
	add("{\"term\":\"madrilene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07599793\"]}");
	add("{\"term\":\"madrona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12251057\"]}");
	add("{\"term\":\"madrono\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12251057\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }