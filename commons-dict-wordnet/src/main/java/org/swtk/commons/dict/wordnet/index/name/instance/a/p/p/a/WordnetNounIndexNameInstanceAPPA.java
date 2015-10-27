package org.swtk.commons.dict.wordnet.index.name.instance.a.p.p.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPPA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"appalachia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08510503\"]}");
	add("{\"term\":\"appalachian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09819231\"]}");
	add("{\"term\":\"appalachians\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09224179\"]}");
	add("{\"term\":\"appalling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07300577\"]}");
	add("{\"term\":\"appaloosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02382395\"]}");
	add("{\"term\":\"appanage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13275342\", \"13319310\"]}");
	add("{\"term\":\"apparatchik\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09819343\", \"09819479\"]}");
	add("{\"term\":\"apparatus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05226173\", \"02730750\"]}");
	add("{\"term\":\"apparel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02731365\"]}");
	add("{\"term\":\"apparency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04714021\"]}");
	add("{\"term\":\"apparentness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04714021\"]}");
	add("{\"term\":\"apparition\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00051304\", \"05906160\", \"07338036\", \"09570240\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }