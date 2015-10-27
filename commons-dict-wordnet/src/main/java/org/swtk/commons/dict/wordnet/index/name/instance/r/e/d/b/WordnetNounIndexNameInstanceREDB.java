package org.swtk.commons.dict.wordnet.index.name.instance.r.e.d.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREDB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"redbelly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01671077\"]}");
	add("{\"term\":\"redberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11744578\", \"13163281\"]}");
	add("{\"term\":\"redbird\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01544027\", \"01600378\"]}");
	add("{\"term\":\"redbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02093031\"]}");
	add("{\"term\":\"redbreast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01564906\"]}");
	add("{\"term\":\"redbrush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12968304\"]}");
	add("{\"term\":\"redbud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12534438\"]}");
	add("{\"term\":\"redbug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01783712\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }