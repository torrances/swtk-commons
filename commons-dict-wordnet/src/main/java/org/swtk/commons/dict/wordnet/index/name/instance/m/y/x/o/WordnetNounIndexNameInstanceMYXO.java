package org.swtk.commons.dict.wordnet.index.name.instance.m.y.x.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYXO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"myxobacter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01381186\"]}");
	add("{\"term\":\"myxobacterales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01380547\"]}");
	add("{\"term\":\"myxobacteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01381186\"]}");
	add("{\"term\":\"myxobacteriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01380778\"]}");
	add("{\"term\":\"myxobacteriales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01380547\"]}");
	add("{\"term\":\"myxobacterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01381186\"]}");
	add("{\"term\":\"myxocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02648747\"]}");
	add("{\"term\":\"myxoedema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14144982\"]}");
	add("{\"term\":\"myxoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14272151\"]}");
	add("{\"term\":\"myxomatosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14298203\"]}");
	add("{\"term\":\"myxomycete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12996564\"]}");
	add("{\"term\":\"myxomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12996368\"]}");
	add("{\"term\":\"myxomycota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12995967\"]}");
	add("{\"term\":\"myxophyceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01361545\"]}");
	add("{\"term\":\"myxosporidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430188\"]}");
	add("{\"term\":\"myxosporidian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430344\"]}");
	add("{\"term\":\"myxovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01339551\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }