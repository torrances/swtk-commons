package org.swtk.commons.dict.wordnet.index.name.instance.m.a.g.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAGN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"magnanimity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04839947\"]}");
	add("{\"term\":\"magnanimousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04877535\"]}");
	add("{\"term\":\"magnate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09859605\"]}");
	add("{\"term\":\"magnesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14714768\"]}");
	add("{\"term\":\"magnesite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14704675\"]}");
	add("{\"term\":\"magnesium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14668427\"]}");
	add("{\"term\":\"magnet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05859350\", \"03710918\"]}");
	add("{\"term\":\"magnetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06130376\"]}");
	add("{\"term\":\"magnetisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05027391\", \"13531636\", \"13620790\"]}");
	add("{\"term\":\"magnetism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06130376\", \"11499458\"]}");
	add("{\"term\":\"magnetite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14970052\"]}");
	add("{\"term\":\"magnetization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05027391\", \"13531636\", \"13620790\"]}");
	add("{\"term\":\"magneto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03713964\"]}");
	add("{\"term\":\"magnetograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03714211\"]}");
	add("{\"term\":\"magnetohydrodynamics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06123676\"]}");
	add("{\"term\":\"magnetometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03714382\"]}");
	add("{\"term\":\"magneton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13663816\"]}");
	add("{\"term\":\"magnetosphere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11497441\"]}");
	add("{\"term\":\"magnetron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03714501\"]}");
	add("{\"term\":\"magnificat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07050805\"]}");
	add("{\"term\":\"magnification\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03294373\", \"06771546\", \"13845207\", \"00368253\"]}");
	add("{\"term\":\"magnificence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04821469\", \"04736586\"]}");
	add("{\"term\":\"magnifico\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10300873\"]}");
	add("{\"term\":\"magnifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03714745\"]}");
	add("{\"term\":\"magniloquence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07084469\"]}");
	add("{\"term\":\"magnitude\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05176417\", \"13845863\", \"05097645\"]}");
	add("{\"term\":\"magnolia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11730143\", \"11730477\"]}");
	add("{\"term\":\"magnoliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11728650\"]}");
	add("{\"term\":\"magnoliidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11687563\"]}");
	add("{\"term\":\"magnoliophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11685380\"]}");
	add("{\"term\":\"magnoliopsid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11687305\"]}");
	add("{\"term\":\"magnoliopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11686232\"]}");
	add("{\"term\":\"magnum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03714902\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }