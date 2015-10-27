package org.swtk.commons.dict.wordnet.index.name.instance.d.i.p.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIPL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dipladenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11793607\"]}");
	add("{\"term\":\"diplegia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14110690\"]}");
	add("{\"term\":\"diplococcus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01383251\"]}");
	add("{\"term\":\"diplodocus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01712818\"]}");
	add("{\"term\":\"diploid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01322584\"]}");
	add("{\"term\":\"diploidy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14594257\"]}");
	add("{\"term\":\"diploma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06490253\"]}");
	add("{\"term\":\"diplomacy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04898060\", \"04849260\", \"07163281\"]}");
	add("{\"term\":\"diplomat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10034403\", \"10033672\"]}");
	add("{\"term\":\"diplomate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10034516\"]}");
	add("{\"term\":\"diplomatist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10033672\"]}");
	add("{\"term\":\"diplopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14176767\"]}");
	add("{\"term\":\"diplopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01789043\"]}");
	add("{\"term\":\"diplopterygium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13191559\"]}");
	add("{\"term\":\"diplotaxis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11905617\"]}");
	add("{\"term\":\"diplotene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13487652\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }