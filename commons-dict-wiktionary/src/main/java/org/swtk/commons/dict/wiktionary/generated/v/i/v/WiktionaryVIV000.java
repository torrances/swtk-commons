package org.swtk.commons.dict.wiktionary.generated.v.i.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVIV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vivacity", "{\"term\":\"vivacity\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|vīvācitās}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being vivacious\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vives", "{\"term\":\"vives\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"Spanish\", \"French\", \"old french (842-ca. 1400)\"], \"text\":\"Old french (842-ca. 1400) \u0027vives\u0027 French \u0027avives\u0027 (compare Spanish \u0027abivas\u0027 , from Arabic\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A disease of animals, especially horses, based in the glands under the ear, where a tumour is formed which sometimes ends in suppuration\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vivid", "{\"term\":\"vivid\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027vividus\u0027 (animated, spirited) from \u0027vivo\u0027 akin to \u0027vita\u0027 (life) Ancient Greek \u0027βίος\u0027 (life)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A felt-tipped permanent marker, genericised from the brand\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vividities", "{\"term\":\"vividities\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1823\u0027\u0027: A\u0026lt;small\u0026gt;UTHOR UNKNOWN\u0026lt;/small\u0026gt;, \u0027The Lady’s magazine (and museum). Improved ser., enlarged\u0027, [http://www.google.co.uk/books?id\u003dckgFAAAAQAAJ\u0026amp;dq\u003dvividities p266\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"…and the \u0027\u0027vividities\u0027\u0027 of passion, the writer may not have known how to procure the morrow’s sustenance\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1925\u0027\u0027: Joseph Conrad, \u0027The Complete Works of Joseph Conrad\u0027, [http://www.google.co.uk/books?id\u003d7ck6AAAAIAAJ\u0026amp;q\u003dvividities\u0026amp;dq\u003dvividities\u0026amp;pgis\u003d1 p255\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"At every momentary pause in his long and fantastic adventure it returned with its splendid charm and glorious serenity, resembling the power of a great and unfathomable love whose tenderness like a sacred spell lays to rest all the \u0027\u0027vividities\u0027\u0027 and all the violences of passionate desire\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1977\u0027\u0027: Angus Wilson \u0026amp; John Holloway, \u0027Writers of East Anglia\u0027, [http://www.google.co.uk/books?id\u003dDuo8AAAAIAAJ\u0026amp;q\u003dvividities\u0026amp;dq\u003dvividities\u0026amp;pgis\u003d1 p120\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"We are the echoes from the planets, \u0026lt;br\u0026gt\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"  the blackbody \u0027\u0027vividities\u0027\u0027, \u0026lt;br\u0026gt\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"  and the high-energy tailing \u0026lt;br\u0026gt\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"  that flows from the springs of time. [ …\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"1995\u0027\u0027: Joseph Conrad, \u0027The Collected Works of Joseph Conrad\u0027, [http://www.google.co.uk/books?id\u003dZY6y3Dujc2AC\u0026amp;pg\u003dPA255\u0026amp;dq\u003dvividities\u0026amp;sig\u003dmLlD5LLYG5zhGTAh_qkgG_Y1Q8E p255] \u0026lt;sup\u0026gt;†\u0026lt;/sup\u0026gt\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"At every momentary pause in his long and fantastic adventure it returned with its splendid charm and glorious serenity, resembling the power of a great and unfathomable love whose tenderness like a sacred spell lays to rest all the \u0027\u0027vividities\u0027\u0027 and all the violences of passionate desire\", \"priority\":11}]}, \"synonyms\":{}}");

	add("vividity", "{\"term\":\"vividity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027vivid\u0027 + \u0027-ity\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality or state of being vivid\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A vivid thing\", \"priority\":2}]}, \"synonyms\":{\"list\":[{\"text\":\"vividness\", \"synonymQualifier\":\"UNCOUNTABLE\"}]}}");

	add("vividness", "{\"term\":\"vividness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vivid|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality or state of being vivid\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vivisection", "{\"term\":\"vivisection\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin \u0027vivus\u0027 alive + English section: compare French \u0027vivisection\u0027. See vivid, and section\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The action of cutting, surgery or other invasive treatment of a living organism for the purposes of physiological or pathological scientific investigation\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }