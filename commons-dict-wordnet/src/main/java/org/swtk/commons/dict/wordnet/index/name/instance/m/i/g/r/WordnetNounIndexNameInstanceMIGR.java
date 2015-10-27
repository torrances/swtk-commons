package org.swtk.commons.dict.wordnet.index.name.instance.m.i.g.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMIGR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"migraine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14351112\"]}");
	add("{\"term\":\"migrant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10334610\"]}");
	add("{\"term\":\"migration\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07327216\", \"07327429\", \"07983035\", \"01125416\"]}");
	add("{\"term\":\"migrator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01320969\", \"10334610\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }