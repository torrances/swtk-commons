package org.swtk.commons.dict.wordnet.index.name.instance.s.t.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stone\", \"synsetCount\":13, \"upperType\":\"NOUN\", \"ids\":[\"04637315\", \"11339129\", \"11339239\", \"11339408\", \"11339565\", \"11339699\", \"11339805\", \"11705208\", \"13742705\", \"14723913\", \"14720954\", \"04333222\", \"09438954\"]}");
	add("{\"term\":\"stonechat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01563434\"]}");
	add("{\"term\":\"stonecress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11890513\"]}");
	add("{\"term\":\"stonecrop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12806649\"]}");
	add("{\"term\":\"stonecutter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10678733\"]}");
	add("{\"term\":\"stoneface\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11840932\"]}");
	add("{\"term\":\"stonefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02646466\"]}");
	add("{\"term\":\"stonefly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02265455\"]}");
	add("{\"term\":\"stonehenge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08674381\"]}");
	add("{\"term\":\"stonemason\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10317198\"]}");
	add("{\"term\":\"stoner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10678832\"]}");
	add("{\"term\":\"stoneroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12865169\"]}");
	add("{\"term\":\"stonewaller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10679010\"]}");
	add("{\"term\":\"stonewalling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01077817\"]}");
	add("{\"term\":\"stoneware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04333814\"]}");
	add("{\"term\":\"stonework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04333937\"]}");
	add("{\"term\":\"stonewort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01415335\"]}");
	add("{\"term\":\"stoning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01166884\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }