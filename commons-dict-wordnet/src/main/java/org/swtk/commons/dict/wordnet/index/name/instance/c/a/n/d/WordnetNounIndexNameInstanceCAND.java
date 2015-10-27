package org.swtk.commons.dict.wordnet.index.name.instance.c.a.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"candela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13663013\"]}");
	add("{\"term\":\"candelabra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02951254\"]}");
	add("{\"term\":\"candelabrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02951254\"]}");
	add("{\"term\":\"candelilla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12941886\", \"12949067\"]}");
	add("{\"term\":\"candida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13100179\"]}");
	add("{\"term\":\"candidacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00801198\"]}");
	add("{\"term\":\"candidate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09910201\", \"09909143\"]}");
	add("{\"term\":\"candidature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00801198\"]}");
	add("{\"term\":\"candidiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14205195\"]}");
	add("{\"term\":\"candidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04878915\"]}");
	add("{\"term\":\"candle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13663013\", \"02951508\"]}");
	add("{\"term\":\"candleberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11762266\"]}");
	add("{\"term\":\"candlelight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11453549\"]}");
	add("{\"term\":\"candlemaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09910346\"]}");
	add("{\"term\":\"candlemas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15211516\"]}");
	add("{\"term\":\"candlenut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11710426\", \"12948254\"]}");
	add("{\"term\":\"candlepin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02951729\"]}");
	add("{\"term\":\"candlepins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00463747\"]}");
	add("{\"term\":\"candlepower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05108013\"]}");
	add("{\"term\":\"candlesnuffer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02951839\"]}");
	add("{\"term\":\"candlestick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02951993\"]}");
	add("{\"term\":\"candlewick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02952270\", \"02952155\"]}");
	add("{\"term\":\"candlewood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12402028\"]}");
	add("{\"term\":\"candor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04878915\", \"06212765\"]}");
	add("{\"term\":\"candour\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06212765\", \"04878915\"]}");
	add("{\"term\":\"candy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07612936\"]}");
	add("{\"term\":\"candyfloss\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07620649\"]}");
	add("{\"term\":\"candymaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09972829\"]}");
	add("{\"term\":\"candytuft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11910088\"]}");
	add("{\"term\":\"candyweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12726218\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }