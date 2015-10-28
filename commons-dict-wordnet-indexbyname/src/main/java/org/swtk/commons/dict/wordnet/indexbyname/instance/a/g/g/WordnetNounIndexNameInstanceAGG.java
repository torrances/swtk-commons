package org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAGG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aggeus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06452607\", \"11041912\"]}");
	add("{\"term\":\"agglomerate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07978094\", \"14735808\"]}");
	add("{\"term\":\"agglomeration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01016432\", \"07975883\"]}");
	add("{\"term\":\"agglomerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02687215\"]}");
	add("{\"term\":\"agglutination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13449977\", \"13449594\", \"13449781\"]}");
	add("{\"term\":\"agglutinin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15053251\"]}");
	add("{\"term\":\"agglutinogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15053569\"]}");
	add("{\"term\":\"aggrandisement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00374352\"]}");
	add("{\"term\":\"aggrandizement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00374352\"]}");
	add("{\"term\":\"aggravation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00375643\", \"01224279\", \"07534117\"]}");
	add("{\"term\":\"aggravator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09797978\"]}");
	add("{\"term\":\"aggregate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08435060\", \"14619105\", \"04360881\"]}");
	add("{\"term\":\"aggregation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01016008\", \"07968050\"]}");
	add("{\"term\":\"aggregator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09956078\"]}");
	add("{\"term\":\"aggression\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01224100\", \"01239732\", \"00966680\", \"07564033\", \"04665625\"]}");
	add("{\"term\":\"aggressiveness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04651019\", \"07564033\", \"04844463\"]}");
	add("{\"term\":\"aggressor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09798117\", \"09840655\"]}");
	add("{\"term\":\"aggro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01175088\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }