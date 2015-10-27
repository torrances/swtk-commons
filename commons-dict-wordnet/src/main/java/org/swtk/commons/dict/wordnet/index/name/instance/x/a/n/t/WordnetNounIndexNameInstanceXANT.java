package org.swtk.commons.dict.wordnet.index.name.instance.x.a.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceXANT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"xanthate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15137395\"]}");
	add("{\"term\":\"xanthelasma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14256637\"]}");
	add("{\"term\":\"xanthemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14590187\"]}");
	add("{\"term\":\"xanthine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15137617\"]}");
	add("{\"term\":\"xanthium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12053408\"]}");
	add("{\"term\":\"xanthoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14256749\"]}");
	add("{\"term\":\"xanthomatosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14257199\"]}");
	add("{\"term\":\"xanthomonad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01364324\"]}");
	add("{\"term\":\"xanthomonas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01364106\"]}");
	add("{\"term\":\"xanthophyceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01403413\"]}");
	add("{\"term\":\"xanthophyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14745796\"]}");
	add("{\"term\":\"xanthophyll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14745796\"]}");
	add("{\"term\":\"xanthopsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14597737\"]}");
	add("{\"term\":\"xanthorrhoeaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12486301\"]}");
	add("{\"term\":\"xanthorroea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12486539\"]}");
	add("{\"term\":\"xanthosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14257456\"]}");
	add("{\"term\":\"xanthosoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11813721\"]}");
	add("{\"term\":\"xantusiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01686069\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }