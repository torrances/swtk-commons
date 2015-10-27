package org.swtk.commons.dict.wordnet.index.name.instance.b.r.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bran\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07584556\", \"14830346\"]}");
	add("{\"term\":\"branch\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02740838\", \"09251231\", \"11435835\", \"13936864\", \"13184148\", \"08418205\"]}");
	add("{\"term\":\"branchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02513400\"]}");
	add("{\"term\":\"branching\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00389200\"]}");
	add("{\"term\":\"branchiobdella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01938638\"]}");
	add("{\"term\":\"branchiobdellidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01938384\"]}");
	add("{\"term\":\"branchiopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01997146\"]}");
	add("{\"term\":\"branchiopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01996830\"]}");
	add("{\"term\":\"branchiopodan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01997146\"]}");
	add("{\"term\":\"branchiostegidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02585550\"]}");
	add("{\"term\":\"branchiostomidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01470145\"]}");
	add("{\"term\":\"branchiura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02000090\"]}");
	add("{\"term\":\"branchlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13184889\"]}");
	add("{\"term\":\"brancusi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10882272\"]}");
	add("{\"term\":\"brand\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04380981\", \"06807523\", \"15125724\", \"06808400\", \"05853667\", \"06858649\"]}");
	add("{\"term\":\"brandenburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08793430\"]}");
	add("{\"term\":\"branding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01225977\"]}");
	add("{\"term\":\"brandish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06903304\"]}");
	add("{\"term\":\"brandt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10882418\"]}");
	add("{\"term\":\"brandy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07919448\"]}");
	add("{\"term\":\"brandyball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07614639\"]}");
	add("{\"term\":\"brandysnap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07710842\"]}");
	add("{\"term\":\"brant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01859966\"]}");
	add("{\"term\":\"branta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01859812\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }