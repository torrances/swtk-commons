package org.swtk.commons.dict.wordnet.index.name.instance.s.w.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSWEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sweep\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00345975\", \"00560592\", \"04378042\", \"07489785\", \"09938519\", \"05135224\"]}");
	add("{\"term\":\"sweeper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02606492\", \"02971234\", \"10702160\"]}");
	add("{\"term\":\"sweeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00253174\"]}");
	add("{\"term\":\"sweepstakes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00509811\"]}");
	add("{\"term\":\"sweet\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05001591\", \"05724524\", \"07612255\", \"07625449\", \"11346725\"]}");
	add("{\"term\":\"sweetbread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07668097\"]}");
	add("{\"term\":\"sweetbreads\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07668097\"]}");
	add("{\"term\":\"sweetbriar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12642380\"]}");
	add("{\"term\":\"sweetbrier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12642380\"]}");
	add("{\"term\":\"sweetener\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05703197\", \"07874571\"]}");
	add("{\"term\":\"sweetening\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00249503\", \"00266836\", \"07874571\"]}");
	add("{\"term\":\"sweetheart\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10633512\", \"10702297\", \"10702400\"]}");
	add("{\"term\":\"sweetie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10702400\"]}");
	add("{\"term\":\"sweetleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12797318\"]}");
	add("{\"term\":\"sweetmeat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07612834\"]}");
	add("{\"term\":\"sweetness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04785869\", \"04987712\", \"05001591\", \"05724524\"]}");
	add("{\"term\":\"sweetpea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12561305\"]}");
	add("{\"term\":\"sweetsop\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07777587\", \"11715554\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }