package org.swtk.commons.dict.wordnet.index.name.instance.m.a.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMANT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"manta\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01502732\", \"03724788\"]}");
	add("{\"term\":\"mantegna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11174847\"]}");
	add("{\"term\":\"manteidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02238413\"]}");
	add("{\"term\":\"mantel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03724882\"]}");
	add("{\"term\":\"mantelet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03725051\", \"03725141\"]}");
	add("{\"term\":\"mantell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11175003\"]}");
	add("{\"term\":\"mantelpiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03724882\"]}");
	add("{\"term\":\"manteodea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02238227\"]}");
	add("{\"term\":\"mantichora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09521432\"]}");
	add("{\"term\":\"manticora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09521432\"]}");
	add("{\"term\":\"manticore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09521432\"]}");
	add("{\"term\":\"mantid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02238696\"]}");
	add("{\"term\":\"mantidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02238413\"]}");
	add("{\"term\":\"mantiger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09521432\"]}");
	add("{\"term\":\"mantilla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03725051\", \"03725234\"]}");
	add("{\"term\":\"mantinea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01288886\"]}");
	add("{\"term\":\"mantineia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01288886\"]}");
	add("{\"term\":\"mantis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02238696\"]}");
	add("{\"term\":\"mantispid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270135\"]}");
	add("{\"term\":\"mantispidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270008\"]}");
	add("{\"term\":\"mantissa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06825973\"]}");
	add("{\"term\":\"mantle\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02959203\", \"03155743\", \"03724882\", \"05251388\", \"09246632\", \"09369347\", \"11175186\", \"06897006\"]}");
	add("{\"term\":\"mantlepiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03724882\"]}");
	add("{\"term\":\"mantlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03725141\"]}");
	add("{\"term\":\"mantophasmatodea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02164389\"]}");
	add("{\"term\":\"mantra\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06478150\", \"07167298\"]}");
	add("{\"term\":\"mantrap\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03725317\", \"10633512\"]}");
	add("{\"term\":\"mantua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03725402\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }