package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pariah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10406011\"]}");
	add("{\"term\":\"paridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01594131\"]}");
	add("{\"term\":\"paries\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05612009\"]}");
	add("{\"term\":\"parietales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12379543\"]}");
	add("{\"term\":\"parietaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12415011\"]}");
	add("{\"term\":\"parimutuel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00508173\"]}");
	add("{\"term\":\"paring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07867030\", \"09408030\"]}");
	add("{\"term\":\"paris\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09168488\", \"09523349\", \"12489877\", \"08952341\"]}");
	add("{\"term\":\"parish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08632576\", \"08240609\"]}");
	add("{\"term\":\"parishioner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10419807\"]}");
	add("{\"term\":\"parisian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09728146\"]}");
	add("{\"term\":\"parisienne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09728285\"]}");
	add("{\"term\":\"parisology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06617316\"]}");
	add("{\"term\":\"parity\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04755666\", \"06114921\", \"13646953\", \"13812345\", \"14070653\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }