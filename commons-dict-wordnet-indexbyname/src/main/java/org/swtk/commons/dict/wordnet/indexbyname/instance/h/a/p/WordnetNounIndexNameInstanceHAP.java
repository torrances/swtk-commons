package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07328877\"]}");
	add("{\"term\":\"haphazardness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04778571\"]}");
	add("{\"term\":\"haphtarah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06464789\"]}");
	add("{\"term\":\"haphtorah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06464789\"]}");
	add("{\"term\":\"haploid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01322805\"]}");
	add("{\"term\":\"haploidy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14594342\"]}");
	add("{\"term\":\"haplopappus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11996322\"]}");
	add("{\"term\":\"haplosporidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01429107\"]}");
	add("{\"term\":\"haplosporidian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01429266\"]}");
	add("{\"term\":\"haplotype\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05447158\"]}");
	add("{\"term\":\"happening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07298313\"]}");
	add("{\"term\":\"happenstance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07331599\"]}");
	add("{\"term\":\"happiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07541996\", \"14010908\"]}");
	add("{\"term\":\"hapsburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08172201\"]}");
	add("{\"term\":\"haptoglobin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14758804\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }