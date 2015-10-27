package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMARR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"marrakech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08992540\"]}");
	add("{\"term\":\"marrakesh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08992540\"]}");
	add("{\"term\":\"marrano\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10315258\"]}");
	add("{\"term\":\"marri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12356741\"]}");
	add("{\"term\":\"marriage\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"14444989\", \"01039028\", \"08005815\", \"13987306\"]}");
	add("{\"term\":\"marriageability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04725306\"]}");
	add("{\"term\":\"married\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10315480\"]}");
	add("{\"term\":\"marrow\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05929717\", \"07732249\", \"07889033\", \"12180072\", \"05293122\"]}");
	add("{\"term\":\"marrowbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07888891\"]}");
	add("{\"term\":\"marrubium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12874661\"]}");
	add("{\"term\":\"marruecos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08991642\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }