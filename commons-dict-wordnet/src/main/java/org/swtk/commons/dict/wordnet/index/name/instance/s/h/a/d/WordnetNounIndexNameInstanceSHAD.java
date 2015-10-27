package org.swtk.commons.dict.wordnet.index.name.instance.s.h.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02533052\", \"07814333\"]}");
	add("{\"term\":\"shadberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07761637\"]}");
	add("{\"term\":\"shadblow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12644285\"]}");
	add("{\"term\":\"shadbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12644285\"]}");
	add("{\"term\":\"shaddock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07766122\", \"12729863\"]}");
	add("{\"term\":\"shade\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"03642609\", \"04189026\", \"05906778\", \"13785325\", \"13975012\", \"06618544\", \"04188779\", \"04966407\", \"14008098\"]}");
	add("{\"term\":\"shades\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04363134\", \"05822120\"]}");
	add("{\"term\":\"shadflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11906626\"]}");
	add("{\"term\":\"shadfly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02265101\"]}");
	add("{\"term\":\"shadiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04819019\", \"14008098\"]}");
	add("{\"term\":\"shading\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01005878\", \"04689375\"]}");
	add("{\"term\":\"shadow\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"10604811\", \"10708600\", \"13982928\", \"05162732\", \"06659391\", \"07537657\", \"05906160\", \"08663881\", \"14008429\"]}");
	add("{\"term\":\"shadowboxing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00899984\"]}");
	add("{\"term\":\"shadower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10708600\"]}");
	add("{\"term\":\"shadowgraph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04049438\"]}");
	add("{\"term\":\"shadowiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14008098\"]}");
	add("{\"term\":\"shadowing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00321312\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }