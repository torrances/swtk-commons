package org.swtk.commons.dict.wiktionary.generated.l.u.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLUP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lupanar", "{\"term\":\"lupanar\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|lupānar}}, from \u0027lupa\u0027 () literally ‘she-wolf’, from \u0027lupus\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A brothel\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1942\u0027\u0027, Elliot Paul, \u0027The Last Time I Saw Paris\u0027, Sickle Moon 2001, p. 33\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A prostitute was not permitted to stand under a street lamp, and sisters were not allowed to work in the same \u0027\u0027\u0027lupanar\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lupin", "{\"term\":\"lupin\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027lupin\u0027 from Latin \u0027lupinus\u0027 (pertaining to the wolf) The reason for association of the plant with the wolf is unclear.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any member of the genus \u0027Lupinus\u0027 in the family Fabaceae\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A , a yellow legume seed of a \u0027Lupinus\u0027 plant (usually ) which is commonly eaten in the Mediterranean area and in Latin America although it is toxic if prepared improperly\", \"priority\":2}]}, \"synonyms\":{}}");

	add("luppie", "{\"term\":\"luppie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lesbian|yuppie|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A high earning gay female living in a major urban are\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, Bell Hooks, \u0027Where we stand: class matters\u0027, [http://books.google.com/books?id\u003dkjo9KtF2jqEC\u0026amp;pg\u003dPA138\u0026amp;dq\u003dluppie+lesbian+urban\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dmToPT5XMOMahiQKXkszgDQ\u0026amp;ved\u003d0CEoQ6AEwBA page 138\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A \u0027\u0027luppie\u0027\u0027 (lesbian professional) doesn\u0027t need to harm or displace a fl\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A high earning latino living in a major urban area\", \"priority\":4}]}, \"synonyms\":{}}");

	add("lupus", "{\"term\":\"lupus\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"Latin\", \"multiple languages\"], \"text\":\"From Latin \u0027lupus\u0027 (wolf)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of a number of autoimmune diseases, the most common of which is systemic lupus erythematosus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lupus", "{\"term\":\"lupus\", \"etymology\":{\"influencers\":[], \"languages\":[\"Latin\", \"multiple languages\"], \"text\":\"From Latin \u0027lupus\u0027 (lang\u003dla)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A summer constellation of the northern sky, said to resemble a wolf. It lies south of the constellation Libra\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }