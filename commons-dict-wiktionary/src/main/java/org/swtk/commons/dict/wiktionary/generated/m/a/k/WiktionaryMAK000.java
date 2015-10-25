package org.swtk.commons.dict.wiktionary.generated.m.a.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("makar", "{\"term\":\"makar\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"scots\"], \"text\":\"From Scots \u0027makar\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A poet writing in Scots\", \"priority\":1}]}, \"synonyms\":{}}");

	add("maker", "{\"term\":\"maker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|make|er|lang\u003den}}. Compare \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who makes; a person or thing that makes or produces something\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"lang\u003den}} God\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A poet\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, w:Alasdair Alasdair Gray, \u0027The Book of Prefaces\u0027, Bloomsbury 2002, p. 9\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"It is refreshing to read how \u0027\u0027makers\u0027\u0027 find great allies in the past to help them tackle the present. It helps us to see that literature is a conversation across boundaries of nation, century and language\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Someone who signs a cheque or promissory note, thereby becoming responsible for payment\", \"priority\":6}]}, \"synonyms\":{}}");

	add("makeline", "{\"term\":\"makeline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|make|line|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A production line for assembling pizza\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Dave Melton, ‎Tim McIntyre, \u0027Hire the American Dream\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Many of Domino\u0027s most senior people started as drivers or on the \u0027\u0027makeline\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Lisa Plumley, \u0027So Irresistible\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"“I didn\u0027t think Emeril would be able to pull so many pizzas off the \u0027\u0027makeline\u0027\u0027 and get them next door so fast,” Frosty was saying, casting her an amiable look\", \"priority\":5}]}, \"synonyms\":{}}");

	add("makemake", "{\"term\":\"makemake\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"rapanui\"], \"text\":\"From Rapanui \u0027makemake\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The creator deity in the mythology of Easter Island\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A dwarf planet and large Kuiper Belt Object, discovered in 2005\", \"priority\":2}]}, \"synonyms\":{}}");

	add("makeress", "{\"term\":\"makeress\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|maker|ess|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A female maker or manufacturer\", \"priority\":1}]}, \"synonyms\":{}}");

	add("makeshift", "{\"term\":\"makeshift\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|make|shift|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A temporary, usually insubstantial, substitution for something else\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I am not a model clergyman, only a decent \u0027\u0027makeshift\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Sir Humphry Dav\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Hoboism cannot be cured or prevented by \u0027\u0027makeshifts\u0027\u0027 or by local measures and efforts, although community interest naturally is vital in dealing with a problem that comes home to every community\", \"priority\":4}]}, \"synonyms\":{}}");

	add("makeup", "{\"term\":\"makeup\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An item\u0027s composition\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"To understand how a nuclear reactor works, we must first look at its \u0027\u0027makeup\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Cosmetics; colorants and other substances applied to the skin to improve its appearance\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"She is wearing a lot of \u0027\u0027makeup\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Replacement; material used to make up for the amount that has been used up\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, William C. Whitman, William M. Johnson, John A. Tomczyk, \u0027Refrigeration \u0026amp; Air Conditioning Technology\u0027, page 1208\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"When the water level drops, the float ball drops with it and opens the valve to the \u0027\u0027makeup\u0027\u0027 water supply\", \"priority\":7}]}, \"synonyms\":{}}");

	add("makonde", "{\"term\":\"makonde\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From \u0027chimakonde\u0027 or \u0027makonde\u0027 the name of the language.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A people of southeast Tanzania and northern Mozambique\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The Bantu language spoken by the Makonde\", \"priority\":2}]}, \"synonyms\":{}}");

	add("makossa", "{\"term\":\"makossa\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A music genre from Cameroon, with a strong base rhythm and prominent horn section\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }