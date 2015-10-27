package org.swtk.commons.dict.wordnet.index.name.instance.a.c.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceACCE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"accelerando\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15289537\"]}");
	add("{\"term\":\"acceleration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15300837\", \"00331283\", \"05067952\"]}");
	add("{\"term\":\"accelerator\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02673012\", \"14747789\", \"02672816\", \"02673313\"]}");
	add("{\"term\":\"accelerometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02673565\"]}");
	add("{\"term\":\"accent\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06835082\", \"07099567\", \"07170369\", \"14458332\", \"07146219\"]}");
	add("{\"term\":\"accenting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01266736\"]}");
	add("{\"term\":\"accentor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01529835\"]}");
	add("{\"term\":\"accentuation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01266736\", \"07099978\"]}");
	add("{\"term\":\"acceptability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04799910\"]}");
	add("{\"term\":\"acceptableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04799910\"]}");
	add("{\"term\":\"acceptance\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00083345\", \"04645532\", \"13402775\", \"07190724\", \"13955454\", \"00181262\", \"06203462\"]}");
	add("{\"term\":\"acceptation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00181262\", \"06615154\", \"14436129\"]}");
	add("{\"term\":\"acceptor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09779015\", \"14608023\"]}");
	add("{\"term\":\"access\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00281976\", \"02673854\", \"06365611\", \"02673692\", \"05182994\", \"05183715\"]}");
	add("{\"term\":\"accessary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09779206\"]}");
	add("{\"term\":\"accessibility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04663006\", \"04726275\"]}");
	add("{\"term\":\"accession\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00237448\", \"05183715\", \"07191852\", \"13274322\", \"13362977\", \"13445650\"]}");
	add("{\"term\":\"accessory\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09779206\", \"02674051\", \"02674410\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }